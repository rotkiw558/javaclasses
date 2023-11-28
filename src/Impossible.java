public class Impossible {
    public static void main(String[] args) {
        int a=2,b=9,c=4,d=5;
        if(a<b){
            if(c<a){
                if(d<c){
                    System.out.println("ORDER (dcab): " + d + " " + c + " " + a + " " + b);
                }else{
                    if(d<a){
                        System.out.println("ORDER (cdab): " + c + " " + d + " " + a + " " + b);
                    }else{
                        if(d<b){
                            System.out.println("ORDER (cadb): " + c + " " + a + " " + d + " " + b);
                        }else{
                            System.out.println("ORDER (cabd): " + c + " " + a + " " + b + " " + d);
                        }
                    }
                }
            }else{
                if(c<b){
                    if(d<a){
                        System.out.println("ORDER (dacb): " + d + " " + a + " " + c + " " + b);
                    }else{
                        if(d<c){
                            System.out.println("ORDER (adcb): " + a + " " + d + " " + c + " " + b);
                        }else{
                            if(d<b){
                                System.out.println("ORDER (acdb): " + a + " " + c + " " + d + " " + b);
                            }else{
                                System.out.println("ORDER (adcb): " + a + " " + c + " " + b + " " + d);
                            }
                        }
                    }
                }else{
                    if(d<a){
                        System.out.println("ORDER (dabc): " + d + " " + a + " " + b + " " + c);
                    }else{
                        if(d<b){
                            System.out.println("ORDER (adbc): " + a + " " + d + " " + b + " " + c);
                        }else{
                            if(d<c){
                                System.out.println("ORDER (abdc): " + a + " " + b + " " + d + " " + c);
                            }else{
                                System.out.println("ORDER (abcd): " + a + " " + b + " " + c + " " + d);
                            }
                        }
                    }
                }
            }
        }else{
            if(c<b){
                if(d<c){
                    System.out.println("ORDER (dcba): " + d + " " + c + " " + b + " " + a);
                }else{
                    if(d<b){
                        System.out.println("ORDER (cdba): " + c + " " + d + " " + b + " " + a);
                    }else{
                        if(d<a){
                            System.out.println("ORDER (cbda): " + c + " " + b + " " + d + " " + a);
                        }else{
                            System.out.println("ORDER (cbad): " + c + " " + b + " " + a + " " + d);
                        }
                    }
                }
            }else{
                if(c<a){
                    if(d<b){
                        System.out.println("ORDER (dbca): " + d + " " + b + " " + c + " " + a);
                    }else{
                        if(d<c){
                            System.out.println("ORDER (bdca): " + b + " " + d + " " + c + " " + a);
                        }else{
                            if(d<a){
                                System.out.println("ORDER (bcda): " + b + " " + c + " " + d + " " + a);
                            }else{
                                System.out.println("ORDER (bcad): " + b + " " + c + " " + a + " " + d);
                            }
                        }
                    }

                }else{
                    if(d<b){
                        System.out.println("ORDER (dbac): " + d + " " + b + " " + a + " " + c);
                    }else{
                        if(d<a){
                            System.out.println("ORDER (bdac): " + b + " " + d + " " + a + " " + c);
                        }else{
                            if(d<c){
                                System.out.println("ORDER (bdac): " + b + " " + a + " " + d + " " + c);
                            }else{
                                System.out.println("ORDER (bacd): " + b + " " + a + " " + c + " " + d);
                            }
                        }
                    }
                }
            }
        }
    }
}
