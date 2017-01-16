package com.muddzdev.viewtobitmaplibrary;


/**
 * Listener to notify the user when the files is saved and its path
 */
public interface OnBitmapSaveListener {
    /**
     * @param isSaved True if the file is saved, false otherwise
     * @param path    The path in the phone of the saved file
     *                This listener is outside
     */
    void onBitmapSaved(boolean isSaved, String path);
}
