package com.company;

public class PassController {
    private PassModel model;
    private PassView view;


    private String Name;
    private String Country;
    private String Profession;


    /**
     * The controller constructor takes a model and view as parameters
     * as it will act as the mediator between them.
     * @param model the model object that will store the student's info
     * @param view the view object that the user will see
     **/
    public PassController(PassModel model, PassView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * This method will allow the controller to take the input given by
     * the user to the view
     **/
    public void getInputFromView()
    {
        view.getInputFromUser();
    }

    /**
     * Through this method, the controller will tell the model to get
     * the info requested by the user
     **/
    public void getUserRequestedInfo()
    {
        model.setPassportInfo(view.getPassId());
        Name = model.getPerName();
        Country = model.getCountry();
        Profession = model.getProfession();
    }

    /**
     * Through this method, the controller will pass the user requested
     * info to the view and update the view with that info.
     **/
    public void updateView()
    {
        view.printPassportDetails(Name,Country,Profession);

    }


}
