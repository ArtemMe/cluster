VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  # Use the same key for each machine
#   config.ssh.insert_key = false
#   config.ssh.private_key_path = "./.vagrant/default/ssh_key/id_rsa"

  config.vm.define "nginx_balancer1" do |vagrant1|
    vagrant1.vm.box = "ubuntu/trusty64"
#     vagrant1.vm.network "forwarded_port", guest: 80, host: 8080
#     vagrant1.vm.network "forwarded_port", guest: 443, host: 8443
    vagrant1.vm.network :private_network, ip: "192.168.4.16"
    vagrant1.vm.provider "virtualbox" do |vb|
          vb.customize ["modifyvm", :id, "--cpus", 1]
          vb.customize ["modifyvm", :id, "--memory", 512]
        end
  end
#   config.vm.define "nginx_balancer2" do |vagrant2|
#     vagrant2.vm.box = "ubuntu/trusty64"
# #     vagrant2.vm.network "forwarded_port", guest: 80, host: 8081
# #     vagrant2.vm.network "forwarded_port", guest: 443, host: 8444
#     vagrant2.vm.network :private_network, ip: "10.1.98.106"
#   end
#   config.vm.define "nginx_front" do |vagrant3|
#     vagrant3.vm.box = "ubuntu/trusty64"
# #     vagrant3.vm.network "forwarded_port", guest: 80, host: 8082
# #     vagrant3.vm.network "forwarded_port", guest: 443, host: 8445
#     vagrant3.vm.network :private_network, ip: "10.1.98.107"
#   end
#   config.vm.define "app1" do |vagrant4|
#       vagrant4.vm.box = "ubuntu/trusty64"
#       vagrant4.vm.network "forwarded_port", guest: 80, host: 8082
#       vagrant4.vm.network "forwarded_port", guest: 443, host: 8445
#       vagrant4.vm.network :private_network, ip: "10.1.98.108"
#   end
#   config.vm.define "app2" do |vagrant5|
#       vagrant5.vm.box = "ubuntu/trusty64"
# #       vagrant3.vm.network "forwarded_port", guest: 80, host: 8082
# #       vagrant3.vm.network "forwarded_port", guest: 443, host: 8445
#       vagrant5.vm.network :private_network, ip: "10.1.98.109"
#   end
#   config.vm.define "jenkins" do |vagrant5|
#     vagrant5.vm.box = "ubuntu/trusty64"
#     vagrant5.vm.network :private_network, ip: "10.1.98.110"
#   end
#   config.vm.define "database_mongo" do |vagrant5|
#       vagrant5.vm.box = "ubuntu/trusty64"
# #       vagrant3.vm.network "forwarded_port", guest: 80, host: 8082
# #       vagrant3.vm.network "forwarded_port", guest: 443, host: 8445
#       vagrant5.vm.network :private_network, ip: "10.1.98.112"
#   end


    ### SSH adjust
#     config.ssh.insert_key = false
#     config.ssh.private_key_path = ['~/.vagrant.d/insecure_private_key', '~/.ssh/id_rsa'] # 2
#     config.vm.provision "file", source: "~/.ssh/id_rsa.pub", destination: "~/.ssh/authorized_keys" # 3
#
#     config.vm.provision "shell", inline: <<-EOC
#       export DEBIAN_FRONTEND=noninteractive
#       sudo apt-get --assume-yes install systemd
#       sudo apt-get --assume-yes install openssh-server
#     EOC
#
#     # 4
#     config.vm.provision "shell", inline: <<-EOC
#       sudo sed -i -e "\\#PasswordAuthentication yes# s#PasswordAuthentication yes#PasswordAuthentication no#g" /etc/ssh/sshd_config
#       sudo systemctl restart sshd.service
#       echo "finished"
#     EOC

end

# ssh nginx_balancer1@10.1.98.105 -i /Users/artemme/IdeaProjects/spring-cloud-example-a/.vagrant/machines/nginx_balancer1/virtualbox/private_key -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -o PasswordAuthentication=no -o IdentitiesOnly=yes