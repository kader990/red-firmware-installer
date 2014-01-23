#!/system/bin/sh
cd $1
su
mount -ro remount,rw /system
mount -ro remount,rw /cache
mount -ro remount,rw /data
sleep 1
cat /mnt/sdcard/red/extendedcommand > /cache/recovery/extendedcommand
sleep 1
cat /mnt/sdcard/red/flash_image > /system/bin/flash_image
sleep 1
cat /mnt/sdcard/red/.recoverycheckpoint > /mnt/sdcard/clockworkmod/.recoverycheckpoint
sleep 1
chmod 777 /cache/recovery/extendedcommand
chmod 777 /system/bin/flash_image
sleep 1
/system/bin/flash_image recovery /mnt/sdcard/red/recovery.img
sync
sleep 1
/system/bin/reboot recovery
exit;
