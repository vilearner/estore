FROM  ibmcom/websphere-liberty:19.0.0.9-webProfile7-ubi-min
COPY  target/estore.war /config/dropins/
