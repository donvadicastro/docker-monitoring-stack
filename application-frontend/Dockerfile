FROM nginx:alpine

WORKDIR /usr/share/nginx/html
COPY ./index.html ./

ENTRYPOINT ["nginx", "-g", "daemon off;"]
