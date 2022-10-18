package ru.mirea.practice.work13;

class OvservableString {
    private StringBuild onChangeListener;
    private StringBuilder stringBuilder;

    public void setOnChangeListener(StringBuild onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public OvservableString() {
        stringBuilder = new StringBuilder();
    }

    private void notifyOnStringBuilderChangeListener() {
        if (onChangeListener != null) {
            onChangeListener.onChange(this);
        }
    }

    public OvservableString append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableString replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableString insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
