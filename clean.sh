echo Cleaning all the files generated by the project
echo Please exit from Eclipse or any other IDE before.
echo After the cleanup you may need to repeat the wcs-setup-offline
echo Press control-c if you are unsure otherwise control-d
read
rm -Rvf target
rm -Rvf project/target
rm -Rvf app/target
rm -Rvf api/target
rm -Rvf core/target
rm -Rvf project\boot
rm -Rvf $HOME/.ivy2/local/com.sciabarra
