package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * The main function contains three objects: view, model
         * and controller. Controller works as the mediator between view and
         * model. Order of operations: User interacts with view ->
         * Controller gets user info from view -> Controller asks the model
         * to fetch the info the user has requested -> Model sends the info
         * to the controller -> Controller sends the user requested info to
         * the view -> Client sees what he wanted to see.
         * ->
         **/

            PassView view = new PassView();
            PassModel model = new PassModel();
            PassController controller = new PassController(model, view);

            controller.getInputFromView();
            controller.getUserRequestedInfo();
            controller.updateView();
    }
}
