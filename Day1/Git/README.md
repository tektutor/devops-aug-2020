# Git Commands

### Configuring user name and email in git
git config --global user.name "Jeganathan Swaminathan"

git config --global user.email "jegan@tektutor.org"

### Listing git configurations
git config --list

### Creating an empty git repository 
git init

### Checking the local git repository status
git status

### Staging your changes to your local git repository
git add <filename>
git add *

### Checking in your files to local git repository
git commit -m "Initial commit."

### Checking logs
git log
git log --oneline --graph

### Adding git remote repository
git remote add origin https://github.com/tektutor/devops-aug-2020.git

### Pushing your local git repo changes to GitHub
git push -u origin master

### Retrieving the latest copy of remote repo in your local machine
git clone https://github.com/tektutor/devops-aug-2020.git

### Retrieving delta changes since your last clone/pull
git pull 

### Discarding local git repo changes permanently
git reset --hard

### Listing branches in local repo
git branch

git branch --list

### Creating a new branch
git branch dev-1.0

git checkout -b dev-1.0

### Switching to an existing branch
git checkout dev-1.0

git switch dev-1.0

## Creating a new branch and switching to it
git checkout -b dev-1.0

git switch -c dev-1.0

### Checkout remote branch
git fetch

git checkout -t origin/remote-branch

### Deleting a local branch
git branch -d my-branch

### Deleting a remote branch
git push origin --delete feature-branch

git push origin :feature-branch
