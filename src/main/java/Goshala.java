

public class Goshala {
    // Country	State	City	Name of Gaushala	No of Cows	Address	E-Mail ID	Phone No
    // Website	Social media links	Single Point of Contact (SPOC)
    // Referral Contact (if any)	Remarks / Comment	Goshala Verified

    private String country;
    private String state;
    private String city;
    private String name;
    private long noOfCows;
    private String email;
    private String phNo;
    private String website;
    private String social_media_link;
    private String spoc;
    private String referral_contact;
    private String comments;
    private boolean verified;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNoOfCows() {
        return noOfCows;
    }

    public void setNoOfCows(long noOfCows) {
        this.noOfCows = noOfCows;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSocial_media_link() {
        return social_media_link;
    }

    public void setSocial_media_link(String social_media_link) {
        this.social_media_link = social_media_link;
    }

    public String getSpoc() {
        return spoc;
    }

    public void setSpoc(String spoc) {
        this.spoc = spoc;
    }

    public String getReferral_contact() {
        return referral_contact;
    }

    public void setReferral_contact(String referral_contact) {
        this.referral_contact = referral_contact;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
