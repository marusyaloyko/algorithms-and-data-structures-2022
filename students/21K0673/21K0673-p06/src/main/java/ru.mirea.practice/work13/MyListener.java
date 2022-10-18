package ru.mirea.practice.work13;

class MyListener implements OnStringBuilderChangeListener {
    public void onChange(OvservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
