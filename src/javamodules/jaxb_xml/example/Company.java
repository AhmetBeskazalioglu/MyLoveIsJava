package javamodules.jaxb_xml.example;

public class Company {

    private String company;
    private String address;
    private String phone;
    private String industry;

    public Company() {

    }

    public Company(String company, String address, String phone, String industry) {
        this.company = company;
        this.address = address;
        this.phone = phone;
        this.industry = industry;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Company [company=" + company + ", address=" + address + ", phone=" + phone + ", industry="
                + industry + "]";
    }
}
