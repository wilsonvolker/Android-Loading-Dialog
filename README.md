# Android-Loading-Dialog
Loading Dialog in Android

Download loadingDialog.java to your project
Downlaod loading_dialog.xml to /res/layout

Usage:

Show Loading Dialog in Fragment (Or Activity):
```java
loadingDialog.Builder builder = new loadingDialog.Builder();
builder.create(getContext());
```

Hide Loading Dialog in Fragment (Or Activity):
```java
builder.dismissdialog();
```
