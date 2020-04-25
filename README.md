# cluster

## day 1
создал машинки на вгранте но подключится по ssh не получилось, потом была долгая история с настройкой ключей на вагрнта и ансибла
хер знает как заработало  - видимо на хостовой машине где то есть кеш с ssh ключами и 
поэтому если ключи на одном ip не совпали то потом поменять их хер знает как

## day 2
Пытаемся создать кучу машинок, огрничим длдя них рам и кпу

## day 3
Цель: Порезечить как организовать общий dns (everica server или файлик host). Как присвоить машинкам имена.
Качаем такую штуку для настройки хостов в vagrant:    
https://github.com/devopsgroup-io/vagrant-hostmanager

и можем настраивать хосты вот так:
```$xslt
  config.hostmanager.enabled = true
  config.hostmanager.manage_host = true
  config.hostmanager.ignore_private_ip = false
  config.hostmanager.include_offline = true

```

## day 4 
Накатить на машинки инфру, nginx + конфиги к нему, docker с приложухами
