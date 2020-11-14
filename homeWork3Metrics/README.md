# Preperation
```shell script
minikube addons disable ingress
kubectl create namespace monitoring
kubectl config set-context --current --namespace=monitoring
helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo add stable https://charts.helm.sh/stable
helm install prom prometheus-community/kube-prometheus-stack -f prometheus.yaml --atomic
helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx
helm repo update
helm install nginx ingress-nginx/ingress-nginx -f nginx-ingress.yaml --atomic
```

An example Ingress that makes use of the controller:
```yaml
  apiVersion: networking.k8s.io/v1beta1
  kind: Ingress
  metadata:
    annotations:
      kubernetes.io/ingress.class: nginx
    name: example
    namespace: foo
  spec:
    rules:
      - host: www.example.com
        http:
          paths:
            - backend:
                serviceName: exampleService
                servicePort: 80
              path: /
```



# Installation
```shell script

helm dependency update ./fedyiv-otus-hw3-chart
helm install myapp fedyiv-otus-hw3-chart/
helm repo update
#View Grafana
kubectl port-forward service/prom-grafana 9000:80
#View Prometheus
kubectl port-forward service/prom-kube-prometheus-stack-prometheus 9090

```
# Testing
Use **User Service.postman_collection.json** to test the service