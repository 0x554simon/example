�����ذ�˵��
-------------

�����ذ��ǡ�����ǳ��Hibernate����http://www.redsaga.com/hibernate_book.html��һ������׽̳̳���Ŀǰ�汾Ϊ1.0.

�����ذ����鼮��ʵսƪ���ܽ��.

���ذ��еĳ�����һ��������ʾ����̳���򣬰���ѭ�򽥽���ԭ�򣬷�Ϊ��ͬ�Ĳ��裺

����1: 
������򵥵���Ŀ�����ṹ��Board/User/Article�����࣬����������������ļ���ͬʱ������һ���У����������࣬�̻���Ŀ������֮�����Լ��ϵ��

����2:
�����µ��������ӡ�ͶƱ�����ͣ�չʾ�Զ��͵Ĵ���

����3:
����webworkʵ�ֵ�GUI��
��������֧�֡�

����4��
������Hibernate 3��


����˵��
---------
������еĳ��򾭹����Ե����л���Ϊ��
1, Tomcat 5.0.25
2, Hibernate 2.1.7
3, Hibernate 3.0.2
4, Eclipse 3.0.1 (��ΪIDE��
5, ant 1.6����Ϊbuild���ߣ�
6, java sdk 1.4.2
7, mysql 4.1 (��Ϊ��̨���ݿ�)
8, ����250MӲ�̿ռ䣨hibernate 2��3��webwork�ͽ�ռ��138M)

��Ȼ�ڸ��߰汾��Ӧ�ÿ��Բ����޸ĵ����У������ǶԴ˲����Ա�֤����v1.2����Hibernate 3.0.4���в��ԣ�

��װ˵��
---------
1, ȷ��jdk 1.4.2�Ѿ���ȷ��װ;
2�������������ѹ������Ŀ¼Ϊ: x:\rs\hib-samples
3, ��hibernate��sf����������2.1.7��3.0.2�汾��
 http://sourceforge.net/project/showfiles.php?group_id=40712
4,�����ص�hibernate����ѹ��x:\rs\hib-samples\hibernate-2.1��x:\rs\hib-samples\hibernate-3��Ŀ¼�ṹӦ��Ϊ��
   x:
    + rs
      + hib-samples     <--- ���ļ�����ѹ��Ŀ¼
        + forum-step1-db-first-middlegen
        + forum-step1-db-first-synchronizer
        + forum-step2
        + ...
        + hibernate-2.1 <---  Hibernate 2.1.7��ѹ������
          + bin         <---  ȷ��bin��docĿ¼���ڽ�ѹ���hibernate-2.1Ŀ¼��
          + doc
          + ...
        + hibernate-3.0 <---  Hibernate 3.0.2��ѹ������
          + bin         <---  ȷ��bin��docĿ¼���ڽ�ѹ���hibernate-3Ŀ¼��
          + doc
          + ...

5��ȷ��tomcat 5 ��װ��ȷ��������ϵͳ�У���ȷ������CATALINA_HOME��������:
  ������windows 2000/xpϵͳ,���Ҽ����"�ҵĵ���","�߼�","��������".
 ȷ�����е�CATALINA_HOME����������ȷָ������tomcat ��װĿ¼.
��:
CATALINA_HOME=D:\PROGRA~1\APACHE~2\TOMCAT~1.0

6, ȷ��mysql 4��װ��ȷ.
���ǽ������ֲ�ͬ��mysql��װ���䣺
  a) ������ʹ��windowsƽ̨�������ǳ���ʹ��mysql �����ǽ��������һ����Ѱ�װ������װ��������easy php: http://prdownloads.sourceforge.net/quickeasyphp/easyphp1-8_setup.exe?download
����Ԥ�Ȱ�װmysql��ֻ��һ�ΰ�װ��������������mysql 4.1.9����������apache, php�Լ�phpmyadmin �������߼�����ȫ���������ߵĻ����������mysql����ƽ̨���ǳ������á�

  b)  mysql ��ʽ��װ�� + �ͻ���
 mysql�����ڴ�����:http://dev.mysql.com/downloads/mysql/4.1.html
 �ͻ����ж��֣����Բ������Լ���mysql administrator��Ҳ���Բ���mysql front����ҵ��Ʒ��mysql front����ʮ����ѵ����������ð汾����һ��ֵ���Ƽ��Ĺ��ߣ�http://www.mysqlfront.de/download.html

 �ڰ�װ��mysql֮����ʹ�ÿͻ��˻���phpmyadmin����һ����Ϊforum��mysql���ݿ⣬���ַ�������ΪUTF-8��������������ĵ�˵��,��phpmyadmin��Ӧ��ѡ��utf8_general_ci�������⻹��Ҫ������Ϊforum���û�������ҲΪforum�����Ҷ�forum������ȫ����Ȩ�ޡ���������ϣ��ʹ�������û�����root������Ҫ�޸�hibernate�����ݿ������е����Ӳ�������λ��hibernate.cfg.xml�У��Լ��������ݿ��ʱ�����Ӳ�������λ��build.xml�С���

7, ȷ��ant��װ��ȷ. ant�����ڴ�����:
 http://ant.apache.org
�� http://www.redsaga.com/down/apache-ant-1.6.1.zip

��ѹ��,�뽫��binĿ¼����ϵͳpath��.

8, ע�⣬���ǵĳ�Ʒ������forum-step3��step1��step2�����м���̡�
ȷ�������Ա�������step3����,��������������,
cd x:\rs\hib-samples (��������Ŀ¼)
cd forum-step3
ant

������װ��ȷ�Ļ�,�����һ��ָ��˵��.
ִ�У�
ant all
�����Զ��������ݿ��ʼ�������롢����tomcat����.(�����������tomcat,���֮ǰtomcat���봦��ֹͣ״̬)

Ȼ��,�����������,����http://localhost:8080/forum ��Ӧ�ÿ������ǵ�ʾ����������.


9, ������Eclipse 3��,�������еĲ��谲װhibernate synchronizer.

10,������eclipse�У���������User Library:
�˵�window -> preference -> Java -> Build Path -> User Librarys,�ֱ�����ΪHibernate2,hibernate3,mysql-jdbc���û��⣬�ֱ������Ӧ��lib�ļ�����hibernate2����hibernate-2.1Ŀ¼�µ�hibernate2.jar����libĿ¼�µ�����jar�ļ�)��

11, ������eclipse ��,�������Ŀ¼�µ�.project�ļ�,�Խ�������.(������Ϊstep1,step2,step3,step4)���ڹ��̵���·�������У�ʹ����һ���������û���(step1-step3ʹ��Hibernate2,step4ʹ��hibernate3)��ȷ��û�б������

����,�����ڿ��Կ�ʼ�Ķ�����,��һЩ�Լ��ĸı�,�������ܵõ�ʲô��� :)

���Ĵ���˵��
------------

�������ĵĴ�������step3����ģ������step1�Լ�step2�У���ʹ��Ӣ�Ľ���ʵ�顣������еĴ���Ϊȫ�̲���UTF-8����.
1,mysql����ʱ���ַ�������ѡ��UTF-8
2,��mysql jdbc���ӵ�url�У�����ָ������utf-8 encoding��
jdbc:mysql://localhost/forum?useUnicode=true&characterEncoding=utf-8&mysqlEncoding=utf8
3����jspҳ���У�ָ��ҳ�����UTF-8����.
 <%@ page contentType="text/html;charset=utf-8"%>

������������Ŀ�У�����ʹ��GBK���룬�������ϵĸ����ط�������Ҫ��UTF-8����ΪGBK��������ʹ�á�


�汾����
-----------
v1.2 (PLAN,TBD)
 * ת����JTA
 * ����һ������DAOģʽ������
 * ����for hibernate 3��xdoclet����

v1.1 (2005.5.25)
 * ����dbĿ¼�µ�build.xml
 * �����˶�ͶƱ��ͼ����ʾ
 * �����˺�webwork��ص�һ������bug

v1.0 (2005.4.20)
 * ��ʼ�汾

�����http://www.redsaga.com/hibernate_book.html���������ذ��ĸ��¡�
