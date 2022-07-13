### PowerShell:
Set-Alias -Name javac -Value  C:\Users\user\Downloads\Java\jdk-11.0.15.1\bin\javac

Set-Alias -Name java -Value  C:\Users\user\Downloads\Java\jdk-11.0.15.1\bin\java

javac --module-path "C:\Users\user\Downloads\Java\javafx-sdk-18.0.1\lib" --add-modules javafx.controls,javafx.fxml *.java 

java --class-path "C:\Users\user\AppData\Local\Packages\TheDebianProject.DebianGNULinux_76v4gfsz19hv4\LocalState\rootfs\home\legioner\Java\STUDY\Java-How-to-Program-11ed\examples\ch13\Painter" --module-path "C:\Users\user\Downloads\Java\javafx-sdk-18.0.1\lib" --add-modules javafx.controls,javafx.fxml Painter