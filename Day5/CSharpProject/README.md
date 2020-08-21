# Build CSharp project

If you have an Visual Studio setup on Window machine with msbuild preinstalled,
you may use the Windows environment as you can develop and compile any type of complex C#
applications in Windows natively.  However, if you wish to learn creating a Jenkins job
for your C# application but all you have is a CentOS machine, no worries, just follow the
steps below.

## Install mono ( a C# open-source framework to develop C# CLI .Net applications in Linux )
Issue the below commands as root user

rpmkeys --import "http://pool.sks-keyservers.net/pks/lookup?op=get&search=0x3fa7e0328081bff6a14da29aa6a19b38d3d831ef"

su -c 'curl https://download.mono-project.com/repo/centos7-stable.repo | tee /etc/yum.repos.d/mono-centos7-stable.repo

sudo yum install -y mono-complete

If you wish to learn on how to create a Jenkins job for your CSharp project but you don't have
a windows machine with Visual Studio pre-installed, no worries.

You may navigage to 

cd devops-aug-2020/Day5/CSharp/HelloWorld/HelloWorld

mcs HelloWorld.cs

mono HelloWorld.exe 
