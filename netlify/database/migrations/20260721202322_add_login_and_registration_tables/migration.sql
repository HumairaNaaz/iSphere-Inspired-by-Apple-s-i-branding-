CREATE TABLE "login" (
	"id" serial PRIMARY KEY,
	"name" text NOT NULL,
	"psw" text NOT NULL
);
--> statement-breakpoint
CREATE TABLE "registration" (
	"id" serial PRIMARY KEY,
	"username" text NOT NULL,
	"email" text NOT NULL,
	"password" text NOT NULL
);
