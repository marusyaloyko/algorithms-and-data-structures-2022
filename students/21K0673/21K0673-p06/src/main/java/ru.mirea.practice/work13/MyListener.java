package ru.mirea.practice.work13;

class MyListener implements StringBuild {
    public void onChange(OvservableString stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
