### ViewToBitmap

An Android library that makes it very easy and very quick to save any View or ViewGroup as an image to the gallery.  
Perfect for photofiltre, quotes and drawing apps!

Currentely used in [Quote Creator] (https://play.google.com/store/apps/details?id=org.m.muddzboy.QuoteCreator&hl=da) with +80.000 downloads! 

### Features

- The library saves in an ```AsyncTask```
- Options to save Bitmaps in the formats: ```.JPG```  ```.PNG ``` ```.nomedia```
- Option to put quality variable for ```JPG``` formats
- Optional listener that gives you a boolean value and String path when/if the image is saved
- Set the name of the  ```Bitmap ``` files and folders. They have by default a timestamp as name for each save  
- Support from API 16+

----

### Example of simple usage:

        ViewToBitmap toBitmap = new ViewToBitmap(this, drawingBoard, "My folder name");
        toBitmap.saveToBitmap();
  
### Example of usage:

     public void bitmapSave(View v) {

        ViewToBitmap toBitmap = new ViewToBitmap(this);
        toBitmap.setFolderName("DrawingApp");
        toBitmap.setFileName("Drawing " + randInt);
        toBitmap.setSaveAsPNG(true);
        toBitmap.setOnBitmapSaveListener(this);
        toBitmap.saveToBitmap();
     }


    @Override
    public void onBitmapSaved(final boolean isSaved, final String path) {
        
        Toast.makeText(this, "Saved at; " + path, Toast.LENGTH_SHORT).show();
     }
    
    

### Installation

Add the depedency in your build.gradle. The library is distributed via jCenter

```groovy
dependencies {
    compile 'com.android.support:appcompat-v7:25.1.0'    
}
```
 ----

### License

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
