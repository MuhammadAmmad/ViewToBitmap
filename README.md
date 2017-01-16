## ViewToBitmap

An Android library that makes it very easy and quick to save any View or ViewGroup as an image to the gallery.

## Features

- Saves in an AsyncTask
- Options to save Bitmaps in formats as: .JPG, .PNG, .nomedia
- Option to put quality variable for JPG.
- Optional listener that gives you a boolean value and String path when/if the image is saved
- If the filename is not set, the class will use System.currentTimeMillis(); as name

## Example of usage:

    BitmapToGallery bitmapToGallery = new BitmapToGallery(this, container, "My App folder name");
    bitmapToGallery.setFileName(fileName); //optional
    bitmapToGallery.setJpgQuality(50);    //optional    
    bitmapToGallery.saveToExternalSD();
  
## Example of usage:

    BitmapToGallery bitmapToGallery = new BitmapToGallery(this, container, "My App folder name");
    bitmapToGallery.setSaveAsPNG(true);             //optional
    bitmapToGallery.setOnBitmapSavedListener(this); //optional
    bitmapToGallery.saveToExternalSD();
    
    
    

 ## Installation




## License

    Copyright Muddii Walid (Muuddz)
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
