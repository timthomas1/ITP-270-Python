# Parsing and extracting data from a URL

import re

websites = ['http:// regexone.com :80 /page', 'ftp://file_server.com:21/top_secret/life_changing_plans.pdf', 'https://regone.com/lesson/introduction#section', 'file://localhost:4040/zip_file', 'https://s3cur3-server.com:9999/']


for url in websites:
    if websites[websites.index(url)].__contains__(':9999'):
        obj2 = re.findall('://([\w\-\.]+)', websites[websites.index(url)])
        print('ALERT: Network traffic detected on Port 9999 by ' + obj2[0] + '.')
