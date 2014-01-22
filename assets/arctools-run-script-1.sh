#!/system/bin/sh
cd $1
su
mount -ro remount,rw /system
mount -ro remount,rw /cache
mount -ro remount,rw /data
mount -ro remount,rw /thirdparty
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED1.apk > /system/app/GoogleRED1.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED1.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED2.apk > /system/app/GoogleRED2.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED2.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED3.apk > /system/app/GoogleRED3.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED3.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED4.apk > /system/app/GoogleRED4.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED4.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED5.apk > /system/app/GoogleRED5.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED5.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED6.apk > /system/app/GoogleRED6.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED6.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED7.apk > /system/app/GoogleRED7.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED7.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED8.apk > /system/app/GoogleRED8.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED8.apk
sleep 1
/system/xbin/busybox cat /thirdparty/app/GoogleRED9.apk > /system/app/GoogleRED9.apk
sleep 1
/system/xbin/busybox chmod 777 /system/app/GoogleRED9.apk
sleep 1
sync
sleep 1
/system/bin/reboot
exit;