VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  # Use the same key for each machine
#   config.ssh.insert_key = false
#   config.ssh.private_key_path = "./.vagrant/default/ssh_key/id_rsa"

  # Configure host
  config.hostmanager.enabled = true
  config.hostmanager.manage_host = true
  config.hostmanager.ignore_private_ip = false
  config.hostmanager.include_offline = true

  config.vm.define "nginx_balancer1" do |vagrant1|
    vagrant1.vm.box = "ubuntu/trusty64"
    vagrant1.vm.hostname = "nginx-lb1"
#     vagrant1.vm.network "forwarded_port", guest: 80, host: 8080
#     vagrant1.vm.network "forwarded_port", guest: 443, host: 8443
    vagrant1.vm.network :private_network, ip: "192.168.4.10"
    vagrant1.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    end
  end
  config.vm.define "nginx_balancer2" do |vagrant2|
    vagrant2.vm.box = "ubuntu/trusty64"
    vagrant2.vm.hostname = "nginx-lb2"
    vagrant2.vm.network :private_network, ip: "192.168.4.11"
    vagrant2.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    end
  end
  config.vm.define "nginx_front" do |vagrant3|
    vagrant3.vm.box = "ubuntu/trusty64"
    vagrant3.vm.hostname = "nginx-front"
    vagrant3.vm.network :private_network, ip: "192.168.4.12"
    vagrant3.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    end
  end
  config.vm.define "app1" do |vagrant4|
    vagrant4.vm.box = "ubuntu/trusty64"
    vagrant4.vm.hostname = "app1"
    vagrant4.vm.network "forwarded_port", guest: 80, host: 8082
    vagrant4.vm.network "forwarded_port", guest: 443, host: 8445
    vagrant4.vm.network :private_network, ip: "192.168.4.13"
    vagrant4.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    end
  end
  config.vm.define "app2" do |vagrant5|
    vagrant5.vm.box = "ubuntu/trusty64"
    vagrant5.vm.hostname = "app2"
    vagrant5.vm.network :private_network, ip: "192.168.4.14"
    vagrant5.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    end
  end
  config.vm.define "jenkins" do |vagrant6|
     vagrant6.vm.box = "ubuntu/trusty64"
     vagrant6.vm.hostname = "jenkins"
     vagrant6.vm.network :private_network, ip: "192.168.4.15"
     vagrant6.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
     end
  end
  config.vm.define "database_mongo" do |vagrant7|
     vagrant7.vm.box = "ubuntu/trusty64"
     vagrant7.vm.hostname = "db-mongo"
     vagrant7.vm.network :private_network, ip: "192.168.4.16"
     vagrant7.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--cpus", 1]
        vb.customize ["modifyvm", :id, "--memory", 512]
        vb.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
     end
  end
end

# ssh nginx_balancer1@10.1.98.105 -i /Users/artemme/IdeaProjects/spring-cloud-example-a/.vagrant/machines/nginx_balancer1/virtualbox/private_key -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -o PasswordAuthentication=no -o IdentitiesOnly=yes