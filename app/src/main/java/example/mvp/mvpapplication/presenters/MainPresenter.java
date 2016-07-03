package example.mvp.mvpapplication.presenters;

import example.mvp.mvpapplication.interfaces.MainModelPresenterOps;
import example.mvp.mvpapplication.interfaces.MainViewPresenterOps;

/**
 * Created by JavierArroyo on 3/7/16.
 */
public class MainPresenter implements MainViewPresenterOps, MainModelPresenterOps {

    // VIEW - PRESENTER
    //---------------------------------------------------------------------------------
    @Override
    public boolean newNote(String texto) {
        return false;
    }

    @Override
    public boolean deleteNote() {
        return false;
    }

    // MODEL - PRESENTER
    //---------------------------------------------------------------------------------

    @Override
    public boolean onNoteInserted() {
        return false;
    }

    @Override
    public boolean onNoteDeleted() {
        return false;
    }

    @Override
    public boolean onError() {
        return false;
    }
}
