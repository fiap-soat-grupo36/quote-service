package br.com.fiap.oficina.quote.service;

import br.com.fiap.oficina.quote.dto.response.OrcamentoResponseDTO;

import java.util.List;

public interface OrcamentoService {
    OrcamentoResponseDTO aprovar(Long id);

    OrcamentoResponseDTO reprovar(Long id);

    List<OrcamentoResponseDTO> buscarTodos();

    OrcamentoResponseDTO buscarPorId(Long id);

    OrcamentoResponseDTO buscarPorOrdemServicoId(Long ordemServicoId);

    void deletar(Long id);

    boolean processarResposta(String token, String resposta);
}
