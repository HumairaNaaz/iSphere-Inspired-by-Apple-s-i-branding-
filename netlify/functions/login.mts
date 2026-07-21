import type { Config } from "@netlify/functions";
import { db } from "../../db/index.js";
import { login } from "../../db/schema.js";

export default async (req: Request) => {
  if (req.method !== "POST") {
    return new Response("Method not allowed", { status: 405 });
  }

  const form = await req.formData();
  const name = String(form.get("name") ?? "");
  const psw = String(form.get("psw") ?? "");

  await db.insert(login).values({ name, psw });

  return new Response(null, {
    status: 303,
    headers: { Location: "/index.html" },
  });
};

export const config: Config = {
  path: "/data",
};
