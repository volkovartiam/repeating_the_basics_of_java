package ru.volkov.lesson5.optional;

public class Driver {
    private String fio;

    private License license = null;

    public Driver() {
    }

    public Driver(String fio, License license) {
        this.fio = fio;
        this.license = license;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
               "fio='" + fio + '\'' +
               ", license=" + license +
               '}';
    }
}
