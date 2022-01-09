package com.company;

public class PassModel {
    private String Name ;
    private String Country ;
    private String Profession;

    /**
     * This method will essentially communicate with the backend
     * database server and get the information that the user has
     * requested. For simplicity and sake of explanation, we are
     * hard-coding the values to make our lives easier. :)
     **/
    public void setPassportInfo(int id)
    {
        if (id==1841246)
        {
            this.Name = "Abdoulaye Mamoudou";
            this.Country = "Cameroon";
            this.Profession = "CSE Engineer";
        }
        else if (id==1741072)
        {
            this.Name = "Mahamat";
            this.Country = "Tchad";
            this.Profession = "Trader";
        }
        else if (id==1841243)
        {
            this.Name = "Aminata";
            this.Country = "Mali";
            this.Profession = "Accountant";
        }
        else
        {
            this.Name = "Unknown";
            this.Country = "Unknown";
            this.Profession = "Unclassified";
        }
    }

    public String getPerName()
    {
        return Name;
    }

    public String getCountry()
    {
        return Country;
    }
    public  String getProfession()
    {
        return Profession;
}
}
