Problema Certificado Digital e Caixa ICP


1º Nada a ver versões IE (Serve para todas versões)

2º desinstalar versões antiga javas

3º instalar nova versões JAVA (cuidado ver qual a versão do SIstema Windows é 64X ou 32X antes de instalar) duvida pesquise google como instalar.

4º após instalado Java, ir Menu> Painel do control > Procure Java> após abrir configurar JAVA > Aba Avançado 

Opções: DESMARCAR

Usar TLS 1.0

Usar TLS 1.2

Usar formato ClientHello compatível com SSL 2.0

5º Aba Segurança Nível Media ou Alta 

Click Editar Lista de Sites

Adicionar todos os sites 

http://www.caixa.gov.br/fgts/conectividade_social_icp.asp

http://www.caixa.gov.br

http://www.receita.fazenda.gov.br

http://conectividade.caixa.gov.br:80

https://conectividade.caixa.gov.br

http://cmt.caixa.gov.br/

https://conectividade.caixa.gov.br/registro

http://conectividade.caixa.gov.br:80/static/cxpostal/applet/cnsenvio.jar

http://conectividade.caixa.gov.br:80/static/cxpostal/applet/msgenvio.jar

https://conectividade.caixa.gov.br/?idprotocolo

https://conectividade.caixa.gov.br/cxpostal/popprotocolo_gepas.m?idmensagem=153047398

http://conectividade.caixa.gov.br:80/static/sicnsregistro/applet/assinar1.jar

http://cmt.caixa.gov.br/

http://obsupgdp.caixa.gov.br/certifica/

https://cav.receita.fazenda.gov.br/ecac/aplicacao.aspx?id=05020&origem=menu

https://conectividade.caixa.gov.br/registro/cnsicp.m;jsessionid=8dbe40014cb7d27a74f550f31a8aa:tbzq?tkeut=6a7ad6ec24d4ce3b4ab3862ad8575039387c0ed8fb89091eca695ed18565c1b1a15d19d66668262b650cfdf3ff993e4610a11d98ab6991646605cc71dff94e7de2fdd19d6d1e56b1ef8e78cbc89f01894fd4359314817869f1d331e7297b6f686c0410a8dc5c4973c20c541560c0c637feb34842bfc5600309308544f0e27deb201501201740030&ticketdata=20150120174003&lcr=0

________________________________________________

6º Caso Windows 7 é precisar configurar variaveis do java, pesquisar no google "como configurar java variaveis do windows 7"

7º Entrar no Explorer IE > configurar > configurações do modo de Exibição de compatibilidade,

Adicionar

*.caixa.gov.br
caixa.gov.br
sp.gov.br
fazenda.gov.br

8º Passo entrar no Explorer IE> configurar> opções da internet > Aba Segurança

Sites confiaveis 

Adicionar

*.caixa.gov.br
caixa.gov.br
sp.gov.br
fazenda.gov.br

desmarcar "Exibir verificação do servidor (https:) para todos os sites desta zona"


Internet Nivel Padrão. com marcado habilitar Modo protegido (requer a reinicialização do IE)




9ºPasso entrar no Explorer IE> configurar> opções da internet >ABA AVANÇADAS 

Desmarcar opções:

Esvaziar a pasta de arquivo de internet temporários quando o navegador for fechado

Usar SSL 2.0

Marcar:

Usar ssl 3.0
usar tls 1.0
usar tls 1.1
usar tls 1.2
verificar revogação de certificados
Verificar se há assinaturas em programas baixados
Verificar se há certificados revogados do fornecedor.


10º Passo entrar no Explorer IE> configurar> opções da internet >ABA Conteúdo

Click Certificados

Após abrir vai aparece "aba pessoal" remover tudo certificados digitais inuteis, deixar só apena um certificado instalado, para evitar conflito da caixa.

após sobrou só um certificado, selecionar certificado e click avançado vai abrir opções avançadas

Selecionar tudo marcados. 

click OK e fechar tudo.


11º Ir ICP do Site Caixa, aceitar tudo java e plugins habilitado, dar permissão do arquivos gerado pelo ncis.
