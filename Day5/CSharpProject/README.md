# Build CSharp project

If you have an Visual Studio setup on Window machine with msbuild preinstalled,
you may use the Windows environment as you can develop and compile any type of complex C#
applications in Windows natively.  However, if you wish to learn creating a Jenkins job
for your C# application but all you have is a CentOS machine, no worries, just follow the
steps below.

## Install mono ( a C# open-source framework to develop C# CLI .Net applications in Linux )

sudo yum-config-manager --add-repo http://download.mono-project.com/repo/centos-beta/

sudo yum install -y mono-complete

If you wish to learn on how to create a Jenkins job for your CSharp project but you don't have
a windows machine with Visual Studio pre-installed, no worries.

You may navigage to 

cd devops-aug-2020/Day5/CSharp
