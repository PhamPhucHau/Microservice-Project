package com.shinhands.mu.Stationary.service;

import com.shinhands.mu.Stationary.dto.HistoryOrderDTO;

import java.util.List;

public interface HistoryOrderService {

    public List<HistoryOrderDTO> getAllOrderByCustomer(long customerId);
}
