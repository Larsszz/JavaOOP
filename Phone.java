package Lesson1;

public class Phone {
    private String model;
    private String number;

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    void registerInNetwork(Network network) {
        Phone[] phones = network.getPhones();
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                phones[i] = new Phone(this.getModel(), this.getNumber());
                return;
            }
        }
        System.out.println("Network overloaded");
    }

    void call (String callNumber, Network network) {
        boolean myPhoneRegistered = false;
        for (Phone myPhone : network.getPhones()) {
            if (myPhone == null) {
                continue;
            }
            if (this.getNumber().equals(myPhone.getNumber())) {
                myPhoneRegistered = true;
            }
        }
        if (myPhoneRegistered) {
            for (Phone phone : network.getPhones()) {
                if (phone == null) {
                    continue;
                }
                if (phone.getNumber().equals(callNumber)) {
                    System.out.println("Number was find. Calling accepted.");
                    return;
                }
            }
            System.out.println("Number is not found in network");
        } else {
            System.out.println("Your number is not register in network");
        }

    }

}
