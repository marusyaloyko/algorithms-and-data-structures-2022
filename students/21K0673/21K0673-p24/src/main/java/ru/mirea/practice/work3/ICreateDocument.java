package ru.mirea.practice.work3;

public interface ICreateDocument {
    IDocument CreateNew(String string);

    IDocument CreateOpen(String string);
}
