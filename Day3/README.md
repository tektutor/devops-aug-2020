# Day3 Lab exercise

## Build CentOS Docker Image

### Let's navigate to Day3/Ansible/centos-sshd-passwordless
cd Day3/Ansible/centos-sshd-passwordless

### You need to overwrite the authorized_keys file with your root user's public key as shown below

cp /root/.ssh/id_rsa.pub authorized_keys

### Build centos 
docker build -t tektutor/ansible-centos .

### You need to create two centos containers
docker run -d --name centos1 --hostname centos1 -p 2003:22 -p 8003:80 tektutor/ansible-centos

docker run -d --name centos2 --hostname centos2 -p 2004:22 -p 8004:80 tektutor/ansible-centos

### You may now check the docker containers
docker ps

### You need to verify if you are able to SSH into the new centos containers
ssh -p 2003 root@localhost

ssh -p 2004 root@localhost

When you SSH into CentOS containers,  it is expected to allow password less login.

You are all set to use the containers now !
