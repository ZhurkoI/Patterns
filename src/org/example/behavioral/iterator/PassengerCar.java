package org.example.behavioral.iterator;

public class PassengerCar implements Collection {

    private String model;
    private String[] options;

    public PassengerCar(String model, String[] options) {
        this.model = model;
        this.options = options;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    @Override
    public MyIterator getIterator() {
        return new OptionIterator();
    }

    private class OptionIterator implements MyIterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < options.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return options[index++];
        }
    }
}
