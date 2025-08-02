create table "task" (
  "id" UUID PRIMARY KEY,
  "title" VARCHAR NOT NULL,
  "description" TEXT,
  "completed" BOOLEAN NOT NULL,
  "created" TIMESTAMP,
  "due" TIMESTAMP
);
