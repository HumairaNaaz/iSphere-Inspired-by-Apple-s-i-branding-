import { pgTable, serial, text } from "drizzle-orm/pg-core";

export const login = pgTable("login", {
  id: serial().primaryKey(),
  name: text().notNull(),
  psw: text().notNull(),
});

export const registration = pgTable("registration", {
  id: serial().primaryKey(),
  username: text().notNull(),
  email: text().notNull(),
  password: text().notNull(),
});
