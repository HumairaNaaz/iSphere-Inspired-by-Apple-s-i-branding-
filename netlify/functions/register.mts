import type { Config } from "@netlify/functions";
import { db } from "../../db/index.js";
import { registration } from "../../db/schema.js";

export default async (req: Request) => {
  if (req.method !== "POST") {
    return new Response("Method not allowed", { status: 405 });
  }

  const form = await req.formData();
  const username = String(form.get("username") ?? "");
  const email = String(form.get("email") ?? "");
  const password = String(form.get("password") ?? "");

  await db.insert(registration).values({ username, email, password });

  return new Response(null, {
    status: 303,
    headers: { Location: "/suniul1.html" },
  });
};

export const config: Config = {
  path: "/data2",
};
