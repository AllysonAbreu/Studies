
ALTER TABLE books DROP CONSTRAINT IF EXISTS books_inserted_by_fkey;
ALTER TABLE books DROP COLUMN IF EXISTS inserted_by;

