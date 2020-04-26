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

По nginx. 
Конфиги кладем сюда ```/etc/nginx/sites-available/```     
Далее есть диерктория с текущеми настройками     
`/etc/nginx/sites-enabled` - Отсюда nginx берет настройки все конифги.       
В настройках делаем финт ушами и создаем ссылку с      
`/etc/nginx/sites-enabled/default` 
на наш конфиг     
`/etc/nginx/sites-available/very_simple_config.conf`       
поэтому дефолтным становится наш конифг.      
В конфигах есть команда `root /data/xxxx` указывает рутовую директорию для всех файлом используемых в конфиге.      
В данный момент создал просто в корне файловой системы папки `/data/images` куда сложил картнки таким образом можем получать картинки по пути `http://192.168.4.10/images/dog_and_code.png`    


Сайты которые помогли:
https://code-maven.com/install-and-configure-nginx-using-ansible.    
https://stackoverflow.com/questions/18954827/how-to-serve-images-with-nginx.   
https://code-maven.com/install-and-configure-nginx-using-ansible.    
https://nginx.org/ru/docs/beginners_guide.html.   
