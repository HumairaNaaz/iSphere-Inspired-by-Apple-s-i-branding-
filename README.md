# iSphere

A Java-based e-commerce product showcase website inspired by Apple's official website. Features product displays for iPhones, iPads, MacBooks, Apple Watch, and AirPods along with user login and registration functionality.

Live : https://agent-6a5fd4b78117e09--whimsical-marigold-3d21a0.netlify.app/

## Features
- Apple-style homepage with product hero sections (iPhone 11 Pro, iPhone 11, MacBook, iPad Pro, Apple Watch)
- Secondary product showcase page (iMac, iPhone 12 Pro, iPhone 12, Apple Watch)
- Animated desktop search bar with quick-links dropdown
- Mobile responsive navigation with hamburger menu
- Custom favicon for browser tab branding
- User registration and login system backed by MySQL
- Styled with custom CSS and Bootstrap 4.5.2

## Technologies
| Technology | Purpose |
|---|---|
| Java 21 | Backend servlets |
| Jakarta Servlet API 6.0 | Web request handling |
| JSP | Server-side templating |
| HTML5 / CSS3 / JavaScript | Frontend |
| Bootstrap 4.5.2 | Registration page styling |
| Font Awesome 6.4.0 | Icons |
| Apache Tomcat 10.x | Application server |
| MySQL 8 | Database |
| Apache Ant | Build system |
| NetBeans IDE | Development environment |

## Project Structure
```
nascome/
├── web/                        # Web content (document root)
│   ├── index.html              # Main homepage
│   ├── 2nd page.html           # Product showcase page
│   ├── registgras.html         # Registration form
│   ├── suniul1.html            # Login form
│   ├── main.jsp                # JSP login page
│   ├── error.html              # Error page
│   ├── style.css               # Main styles
│   ├── 2nd page.css            # 2nd page styles
│   ├── sunil1.css              # Login page styles
│   ├── main.js                 # Desktop/mobile nav logic
│   ├── 2nd page.js             # 2nd page mobile nav
│   ├── assets/                 # Images and icons
│   │   └── favicon.ico         # Site favicon
│   └── WEB-INF/
│       ├── web.xml             # Servlet configuration
│       ├── lib/                # JDBC driver
│       └── context.xml         # Tomcat context config
├── src/java/
│   ├── data.java               # Login servlet
│   └── data2.java              # Registration servlet
├── build.xml                   # Ant build file
└── nbproject/                  # NetBeans project config
```

## Prerequisites
- Java JDK 21 or higher
- Apache Tomcat 10.x
- Apache Ant 1.7.1+
- MySQL 8.x
- NetBeans IDE (optional, for IDE integration)

## Database Setup
1. Start MySQL on `localhost:3306`
2. Create the database and tables:
```sql
CREATE DATABASE grasstech;
CREATE TABLE grasstech.login (
    name VARCHAR(255),
    psw VARCHAR(255)
);
CREATE TABLE grasstech.registration (
    username VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);
CREATE TABLE grasstech.user (
    name VARCHAR(255),
    psw VARCHAR(255)
);
```
Default MySQL credentials: user `root`, password empty.

## Build
Using Apache Ant:
```bash
ant -Dj2ee.server.home=<tomcat_installation_directory> clean
ant -Dj2ee.server.home=<tomcat_installation_directory> dist
```
This produces `dist/nascome.war`.

## Deploy
Copy `dist/nascome.war` to Tomcat's `webapps/` directory, or open the project in NetBeans and use the Run command for automatic build and deploy.

## Access
| Page | URL |
|---|---|
| Homepage | http://localhost:8080/nascome/index.html |
| Login | http://localhost:8080/nascome/suniul1.html |
| Registration | http://localhost:8080/nascome/registgras.html |

## Author
Humaira Naaz
