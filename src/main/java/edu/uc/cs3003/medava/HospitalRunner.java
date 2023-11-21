package edu.uc.cs3003.medava;
public class HospitalRunner {
    public static void run() {
        Transporter semiTruck = new Transporter();

        Pharmacy cvs = new Pharmacy("CVS at 7500 Beechmont Avenue");

        cvs.send(semiTruck);

        Hospital uc = new Hospital("World Famous University of Cincinnati Children's Hospital");

        uc.receive(semiTruck);
    }
}
