FROM nginx:alpine

WORKDIR /usr/share/nginx/html
COPY ./dist/application-frontend/* ./

ENTRYPOINT ["nginx", "-g", "daemon off;"]
