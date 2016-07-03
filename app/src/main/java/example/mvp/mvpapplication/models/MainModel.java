package example.mvp.mvpapplication.models;

import example.mvp.mvpapplication.interfaces.MainModelOps;

/**
 * Created by JavierArroyo on 3/7/16.
 */
public class MainModel implements MainModelOps {
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
