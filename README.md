# Spring-Boot-Redis
 
 Redis คือ open source ที่เก็บโครงสร้างข้อมูลไว้ใน memory ซึ่งเป็น NOSQL ตัวหนึ่ง สามารถใช้ทำ database, cache, message broker ได้
 
### Redis configuration file

- Windows (redis.windows.conf)
 
		redis-server redis.windows.conf

- Linux (redis.conf)


### Connect to Redis with (redis-cli)

 | Argument name | Description |
 | ------------- |-------------|
 | -h  | hostname |
 | -p  | port |
 | -a  | password |



	redis-cli -h localhost -p 6379 

      
### Redis keys commands

open redis-cli

 - Delete All Key
                  
       FLUSHALL

-  Delete key if it exists.

       DEL key

### Tools
- Another Redis DeskTop Manager (url = https://github.com/qishibo/AnotherRedisDesktopManager)

## Reference

- https://github.com/microsoftarchive/redis/releases/tag/win-2.8.2104
