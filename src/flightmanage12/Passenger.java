package flightmanage12;

public class Passenger {
    private int id;
    private static int idCounter;
    //Nested class Address inside Passenger class
    private class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

        //Composition relationship between Address and Passenger classes
        private Address address;

        //Nested class Contact inside Passenger class
        private class Contact {
            String name, phone, email;

            public Contact(String name, String phone, String email) {
                this.name = name;
                this.phone = phone;
                this.email = email;
            }
        }

        //Composition relationship between Contact and Passenger Classes
        private Contact contact;

        //Parametrised Constructor
        public Passenger(String street, String city, String state, String name, String phone, String email) {
            this.id = idCounter++;

            //Composition relationship between Address and Passenger,Address object created inside Passenger object
            this.address = new Address(street, city, state);
            //Composition relationship between Contact and Passenger,Contact object created inside Passenger object
            this.contact = new Contact(name, phone, email);
        }

        String getPassAddressDetails() {
            return address.street + ", " + address.city + "," + address.state;
        }

        String getPassengerContactDetails() {
            return contact.name + "," + contact.phone + "," + contact.email;
        }

        public int getPassengerCount() {
            return idCounter;
        }
    }


