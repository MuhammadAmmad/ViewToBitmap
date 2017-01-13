# ViewToBitmap

An Android library that makes it very easy and quick to save any View or ViewGroup as an image to the gallery.

Features

Saves in an AsyncTask
Options to save Bitmaps in formats as: .JPG, .PNG, .nomedia
Option to put quality variable for JPG.
Optional listener that gives you a boolean value and String path when/if the image is saved
If the filename is not set, the class will use System.currentTimeMillis(); as name

#1 Example of usage:

  BitmapToGallery bitmapToGallery = new BitmapToGallery(this, container, "My App folder name");
  bitmapToGallery.setFileName(fileName); //optional
  bitmapToGallery.setJpgQuality(50);    //optional    
  bitmapToGallery.saveToExternalSD();
#2 Example of usage:

  BitmapToGallery bitmapToGallery = new BitmapToGallery(this, container, "My App folder name");
  bitmapToGallery.setSaveAsPNG(true);             //optional
  bitmapToGallery.setOnBitmapSavedListener(this); //optional
  bitmapToGallery.saveToExternalSD();
