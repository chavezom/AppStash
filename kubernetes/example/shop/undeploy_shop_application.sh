#!/bin/sh
kubectl delete -f redis.yml
kubectl delete -f redis-service.yml
kubectl delete -f cart.yml
kubectl delete -f cart-service.yml
kubectl delete -f cart-controller.yml
kubectl delete -f mongodb.yml
kubectl delete -f mongodb-service.yml
kubectl delete -f product.yml
kubectl delete -f product-service.yml
kubectl delete -f product-controller.yml
kubectl delete -f navigation.yml
kubectl delete -f navigation-service.yml
kubectl delete -f navigation-controller.yml
kubectl delete -f shop.yml
kubectl delete -f shop-service.yml
kubectl delete -f catalog.yml
kubectl delete -f catalog-service.yml
kubectl delete -f catalog-controller.yml