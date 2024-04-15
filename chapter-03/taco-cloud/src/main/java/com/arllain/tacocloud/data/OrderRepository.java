package com.arllain.tacocloud.data;

import com.arllain.tacocloud.domain.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
