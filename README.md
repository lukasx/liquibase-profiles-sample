# Liquibase with Spring profiles

A simple project that shows how liquibase changelog may be managed by Spring profiles

## Running

To run project, simply call

    mvnw.cmd spring-boot:run -Dspring-boot.run.profiles=customera

or

    mvnw.cmd spring-boot:run -Dspring-boot.run.profiles=customerb

And check the standard output to see that the Liquibase changelogs are picked up from different
paths:

Profile 'customera':

    2018-10-24 08:46:32.183  INFO 13616 --- [           main] liquibase                                : classpath:liquibase/customera/dbchangelog.xml: classpath:liquibase/customera/../masterchangelog.xml::1::John: Table users created
    2018-10-24 08:46:32.185  INFO 13616 --- [           main] liquibase                                : classpath:liquibase/customera/dbchangelog.xml: classpath:liquibase/customera/../masterchangelog.xml::1::John: ChangeSet classpath:liquibase/customera/../masterchangelog.xml::1::John ran successfully in 3ms
    2018-10-24 08:46:32.206  INFO 13616 --- [           main] liquibase                                : classpath:liquibase/customera/dbchangelog.xml: classpath:liquibase/customera/dbchangelog.xml::2::Bill: Columns name(varchar(255)) added to users
    2018-10-24 08:46:32.207  INFO 13616 --- [           main] liquibase                                : classpath:liquibase/customera/dbchangelog.xml: classpath:liquibase/customera/dbchangelog.xml::2::Bill: ChangeSet classpath:liquibase/customera/dbchangelog.xml::2::Bill ran successfully in 11ms

Profile 'customerb':

    2018-10-24 08:43:37.863  INFO 18968 --- [           main] liquibase                                : classpath:liquibase/customerb/dbchangelog.xml: classpath:liquibase/customerb/../masterchangelog.xml::1::John: Table users created
    2018-10-24 08:43:37.863  INFO 18968 --- [           main] liquibase                                : classpath:liquibase/customerb/dbchangelog.xml: classpath:liquibase/customerb/../masterchangelog.xml::1::John: ChangeSet classpath:liquibase/customerb/../masterchangelog.xml::1::John ran successfully in 1ms
    2018-10-24 08:43:37.881  INFO 18968 --- [           main] liquibase                                : classpath:liquibase/customerb/dbchangelog.xml: classpath:liquibase/customerb/dbchangelog.xml::2::Adam: Columns age(int) added to users
    2018-10-24 08:43:37.882  INFO 18968 --- [           main] liquibase                                : classpath:liquibase/customerb/dbchangelog.xml: classpath:liquibase/customerb/dbchangelog.xml::2::Adam: ChangeSet classpath:liquibase/customerb/dbchangelog.xml::2::Adam ran successfully in 9ms


