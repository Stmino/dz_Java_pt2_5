package dz5;
import dz5.Model.DivModel;
import dz5.Model.MultModel;
import dz5.Model.SubModel;
import dz5.Model.SumModel;
import dz5.Presenter.Presenter;
import dz5.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter s = new Presenter(new SumModel(), new View());
        Presenter m = new Presenter(new MultModel(), new View());
        Presenter d = new Presenter(new DivModel(), new View());
        Presenter su = new Presenter(new SubModel(), new View());
        switch (View.getMark()) {
            case '+':
                s.buttonClick();
                break;
            case '-':
                su.buttonClick();
                break;
            case '/':
                d.buttonClick();
                break;
            case '*':
                m.buttonClick();
                break;
        }
    }
}
