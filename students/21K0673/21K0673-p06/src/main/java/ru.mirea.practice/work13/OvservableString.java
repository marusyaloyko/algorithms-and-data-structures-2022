package ru.mirea.practice.work13;

class OvservableString {
    private StringBuild onChangeListener;
    private StringBuilder buffer;

    public void setOnChangeListener(StringBuild onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public OvservableString() {
        buffer = new StringBuilder();
    }

    private void notifyOnStringBuilderChangeListener() {
        if (onChangeListener != null) {
            onChangeListener.onChange(this);
        }
    }

    public OvservableString append(Object obj) {
        buffer.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableString replace(int start, int end, String str) {
        buffer.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableString insert(int index, char[] str, int offset, int len) {
        buffer.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public String toString() {
        return buffer.toString();
    }
}
